package com.sirius.server.util;

import com.sirius.server.ServerApplication;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtil {
	private static List<Class> allList = new ArrayList<>();
	
	static {
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			String packagename = ServerApplication.class.getPackage().getName();
			Enumeration<URL> enumeration = classLoader.getResources(packagename.replace('.', '/'));
			while (enumeration.hasMoreElements()) {
				URL url = enumeration.nextElement();
				allList.addAll(loadClass(new File(url.getFile()), packagename));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Class> getAllClassByInterface(Class clazz) {
		List<Class> list = new ArrayList<>();
		allList.forEach(e -> {
			if (!e.isInterface() && clazz.isAssignableFrom(e)) {
				list.add(e);
			}
		});
		return list;
	}
	
	private static List<Class> loadClass(File file, String packagename) {
		List<Class> list = new ArrayList<>();
		if (!file.exists()) {
			return list;
		}
		for (File file2 : file.listFiles()) {
			if (file2.isDirectory()) {
				if (!file2.getName().contains(".")) {
					list.addAll(loadClass(file2, packagename + "." + file2.getName()));
				}
			} else if (file2.getName().endsWith(".class")) {
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