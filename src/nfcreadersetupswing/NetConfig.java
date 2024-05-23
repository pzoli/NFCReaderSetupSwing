/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nfcreadersetupswing;

import java.io.Serializable;

/**
 *
 * @author pzoli
 */
public class NetConfig implements Serializable {
    public String action;
    public String state;
    public int usedhcp;
    public String serverip;
    public String ip;
    public String subnet;
    public String gateway;
    public String dnsserver;
    public String request;
    public String mac;
}
