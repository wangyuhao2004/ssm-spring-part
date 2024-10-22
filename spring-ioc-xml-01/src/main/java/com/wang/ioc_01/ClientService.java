package com.wang.ioc_01;

/**
 * @Author 王玉豪
 * @Date 2024/10/13 13:39
 * @PackageName:com.wang.ioc_01
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}
    public static ClientService clientInstance() {
        return clientService;
    }
}
