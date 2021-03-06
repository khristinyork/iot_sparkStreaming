package com.iot.data.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CreateHbaseTabs{
	
	// conf file settings
	private static File dirNamefile;
	private static File currDirParentPath;
	private static String confFileName;
	private static String confTypeFile;
	private static JSONParser confParser = new JSONParser();
	private static Object confObj;
	private static JSONObject confJsonObject;
	// hbase conf
	private Configuration hbaseConf;
	private static HBaseAdmin hBaseAdmin;
	private static String hbase_master_ip;
	private static String hbase_master_port;
	private static String hbase_zookeeper_port;
	private static String raw_iot_tab_name;
	private static String raw_iot_tab_colfam;
	private static String push_trigger_campaign_tab_name;
	private static String push_trigger_campaign_tab_colfam;
	private static String push_trigger_deviceInput_tab_name;
	private static String push_trigger_deviceInput_tab_colfam;
	private static String push_trigger_deviceStats_tab_name;
	private static String push_trigger_deviceStats_tab_colfam;
	public CreateHbaseTabs() throws IOException, ParseException {
		// ###################### CONF FILE TYPE ######################
		// ###################### CONF FILE TYPE ######################
		// settings for production or testing (choose one)
		confTypeFile = "production_conf.json";
		// ###################### CONF FILE TYPE ######################
		// ###################### CONF FILE TYPE ######################
		// read conf file and corresponding params
		dirNamefile = new File(System.getProperty("user.dir"));
		currDirParentPath = new File(dirNamefile.getParent());
		confFileName= currDirParentPath.toString() + "/conf/" + confTypeFile;
		// read the json file and create a map of the parameters
		confObj = confParser.parse(new FileReader(
				confFileName));
        confJsonObject = (JSONObject) confObj;

        raw_iot_tab_name = (String) confJsonObject.get("hbase_table_primary");
        raw_iot_tab_colfam = (String) confJsonObject.get("hbase_raw_data_tab_colfam");
        push_trigger_campaign_tab_name = "push_trigger_campaign";
        push_trigger_campaign_tab_colfam = "push_trigger_campaign_cf";
        push_trigger_deviceInput_tab_name = "push_trigger_device_input_tab";
        push_trigger_deviceInput_tab_colfam = "push_trigger_device_input_cf";
        push_trigger_deviceStats_tab_name = "push_trigger_device_stats_tab";
        push_trigger_deviceStats_tab_colfam = "push_trigger_device_stats_cf";
        hbase_master_ip = (String) confJsonObject.get("server_ip");
        hbase_master_port = (String) confJsonObject.get("hbase_master_port");
        hbase_zookeeper_port = (String) confJsonObject.get("hbase_zookeeper_port");
		// convert JSON string to Map
//		confMap = confMapper.readValue(inpJson, new TypeReference<Map<String, String>>(){});
		// hbase conf
		hbaseConf = HBaseConfiguration.create();
	    hbaseConf.set("hbase.master",hbase_master_ip + ":" + hbase_master_port);
	    hbaseConf.set("hbase.zookeeper.quorum", hbase_master_ip);
	    hbaseConf.set("hbase.zookeeper.property.clientPort", hbase_zookeeper_port);
	    // the below setting ain't working for the hbase version we 
	    // are using. Commenting it out.
//	    hbaseConf.set("zookeeper.znode.parent", "/hbase-unsecure");
	    hBaseAdmin = new HBaseAdmin(hbaseConf);
	  }
	
	public static void createRawIotDataTable() {  
        System.out.println("start create table--->" + raw_iot_tab_name);  
        try {    
            if (hBaseAdmin.tableExists(raw_iot_tab_name)) { 
                System.out.println(raw_iot_tab_name + 
                		" already exists...delete it manually and comeback bro!");  
                return;
            }  
            HTableDescriptor tableDescriptor = new HTableDescriptor(raw_iot_tab_name);  
            tableDescriptor.addFamily(new HColumnDescriptor(raw_iot_tab_colfam));  
            hBaseAdmin.createTable(tableDescriptor);  
        } catch (MasterNotRunningException e) {  
            e.printStackTrace();  
        } catch (ZooKeeperConnectionException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        System.out.println("succesfully created table--->" + raw_iot_tab_name);    
    }
	
	
	public static void createPushTriggerTable() {  
        System.out.println("start create table--->" + push_trigger_campaign_tab_name);  
        try {    
            if (hBaseAdmin.tableExists(push_trigger_campaign_tab_name)) { 
                System.out.println(push_trigger_campaign_tab_name + 
                		" already exists...delete it manually and comeback bro!");  
                return;
            }  
            HTableDescriptor tableDescriptor = new HTableDescriptor(push_trigger_campaign_tab_name);  
            tableDescriptor.addFamily(new HColumnDescriptor(push_trigger_campaign_tab_colfam));  
            hBaseAdmin.createTable(tableDescriptor);  
        } catch (MasterNotRunningException e) {  
            e.printStackTrace();  
        } catch (ZooKeeperConnectionException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        System.out.println("succesfully created table--->" + push_trigger_campaign_tab_name);    
    }
	
	public static void createPushTriggerDeviceInputInfoTable() {  
        System.out.println("start create table--->" + push_trigger_deviceInput_tab_name);  
        try {    
            if (hBaseAdmin.tableExists(push_trigger_deviceInput_tab_name)) { 
                System.out.println(push_trigger_deviceInput_tab_name + 
                		" already exists...delete it manually and comeback bro!");  
                return;
            }  
            HTableDescriptor tableDescriptor = new HTableDescriptor(push_trigger_deviceInput_tab_name);  
            tableDescriptor.addFamily(new HColumnDescriptor(push_trigger_deviceInput_tab_colfam));  
            hBaseAdmin.createTable(tableDescriptor);  
        } catch (MasterNotRunningException e) {  
            e.printStackTrace();  
        } catch (ZooKeeperConnectionException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        System.out.println("succesfully created table--->" + push_trigger_deviceInput_tab_name);    
    }
	
	public static void createPushTriggerDeviceStatsTable() {  
        System.out.println("start create table--->" + push_trigger_deviceStats_tab_name);  
        try {    
            if (hBaseAdmin.tableExists(push_trigger_deviceStats_tab_name)) { 
                System.out.println(push_trigger_deviceStats_tab_name + 
                		" already exists...delete it manually and comeback bro!");  
                return;
            }  
            HTableDescriptor tableDescriptor = new HTableDescriptor(push_trigger_deviceStats_tab_name);  
            tableDescriptor.addFamily(new HColumnDescriptor(push_trigger_deviceStats_tab_colfam));  
            hBaseAdmin.createTable(tableDescriptor);  
        } catch (MasterNotRunningException e) {  
            e.printStackTrace();  
        } catch (ZooKeeperConnectionException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        System.out.println("succesfully created table--->" + push_trigger_deviceStats_tab_name);    
    }
	
	public static void main(String[] args) throws IOException, ParseException {
		CreateHbaseTabs crtTabObj = new CreateHbaseTabs();
//		crtTabObj.createRawIotDataTable();
//		crtTabObj.createPushTriggerTable();
		crtTabObj.createPushTriggerDeviceInputInfoTable();
		crtTabObj.createPushTriggerDeviceStatsTable();
		System.exit(0);
	  }

}
