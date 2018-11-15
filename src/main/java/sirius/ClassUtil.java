package sirius;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;

public class ClassUtil {
	
	public static ArrayList<Class> getAllClassByInterface(Class clazz) {
		ArrayList<Class> list = new ArrayList<>();
		ArrayList<Class> allClass = getAllClass(clazz.getPackage().getName());
		for (int i = 0; i < allClass.size(); i++) {
			if (clazz.isAssignableFrom(allClass.get(i))) {
				if (!clazz.equals(allClass.get(i))) {
					list.add(allClass.get(i));
				}
			}
		}
		return list;
	}
	
	private static ArrayList<Class> getAllClass(String packagename) {
		ArrayList<Class> list = new ArrayList<>();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String path = packagename.replace('.', '/');
		ArrayList<File> fileList = new ArrayList<>();
		
		Enumeration<URL> enumeration = null;
		try {
			enumeration = classLoader.getResources(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (enumeration.hasMoreElements()) {
			URL url = enumeration.nextElement();
			// 获取此 URL 的文件名
			fileList.add(new File(url.getFile()));
		}
		for (int i = 0; i < fileList.size(); i++) {
			list.addAll(findClass(fileList.get(i), packagename));
		}
		return list;
	}
	
	private static ArrayList<Class> findClass(File file, String packagename) {
		ArrayList<Class> list = new ArrayList<>();
		if (!file.exists()) {
			return list;
		}
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.isDirectory()) {
				//assert !file2.getName().contains(".");// 添加断言用于判断
				if (!file2.getName().contains(".")) {
					ArrayList<Class> arrayList = findClass(file2, packagename + "." + file2.getName());
					list.addAll(arrayList);
				}
			} else if (file2.getName().endsWith(".class")) {
				// 保存的类文件不需要后缀.class
				try {
					list.add(Class.forName(packagename + '.' + file2.getName().substring(0, file2.getName().length() - 6)));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
}