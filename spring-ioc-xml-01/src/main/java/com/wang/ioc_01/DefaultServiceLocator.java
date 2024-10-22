package com.wang.ioc_01;

/**
 * @Author 王玉豪
 * @Date 2024/10/13 13:50
 * @PackageName:com.wang.ioc_01
 */
public class DefaultServiceLocator {

    private static ClientServiceImpl clientService = new ClientServiceImpl();

    public ClientServiceImpl createClientServiceInstance() {
        return clientService;
    }
}
