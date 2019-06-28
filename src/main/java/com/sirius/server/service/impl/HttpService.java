package com.sirius.server.service.impl;

import com.sirius.server.service.IService;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLContext;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @Date:2019/6/28 22:43
 * @Author:高连棣
 */
@Service
public class HttpService implements IService {

    @Autowired
    private PoolingHttpClientConnectionManager connMrg;

    public CloseableHttpClient getHttpClient() {
        return HttpClients.custom().setConnectionManager(connMrg).build();
    }

    public CloseableHttpClient getHttpsClient() {
        return getHttpsClient(createSSLConnSocketFactory());
    }

    public CloseableHttpClient getHttpsClient(SSLConnectionSocketFactory sslConnectionSocketFactory) {
        return HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).setConnectionManager(connMrg).build();
    }

    private SSLConnectionSocketFactory createSSLConnSocketFactory() {
        SSLConnectionSocketFactory sslConnectionSocketFactory = null;
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                @Override
                public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                    return true;
                }
            }).build();
            sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        return sslConnectionSocketFactory;
    }
}
