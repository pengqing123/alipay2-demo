package com.song.config;

/**
 * Created by Song on 2017/6/7.
 */
/*
@Configuration
@ConfigurationProperties(prefix = "mongo")
public class MongoConfig {

    private String hostport;
    private String dbName;
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Integer connectionsPerHost;
    private Integer threadsAllowedToBlockForConnectionMultiplier;
    private Integer connectTimeout;
    private Integer maxWaitTime;
    private Boolean autoConnectRetry;
    private Boolean socketKeepAlive;
    private Boolean slaveOk;
    private Integer socketTimeout;
    private Integer writeNumber=1;
    private Integer writeTimeout=0;
    private Boolean writeFsync=true;

    @Bean
    public MongoTemplate getMongoTemplate() throws Exception {
        MongoOptions mongoOptions = new MongoOptions();
        mongoOptions.setConnectionsPerHost(connectionsPerHost);
        mongoOptions.setThreadsAllowedToBlockForConnectionMultiplier(threadsAllowedToBlockForConnectionMultiplier);
        mongoOptions.setConnectTimeout(connectTimeout);
        mongoOptions.setMaxWaitTime(maxWaitTime);
//        mongoOptions.setAutoConnectRetry(autoConnectRetry);
        mongoOptions.setSocketKeepAlive(socketKeepAlive);
        mongoOptions.setSocketTimeout(socketTimeout);
        mongoOptions.setWriteConcern(new WriteConcern(writeNumber, writeTimeout, writeFsync));

        MongoClient mongoClient = new MongoClient(host, port);

        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongoClient, dbName);
        MongoTemplate mongoTemplate = new MongoTemplate(simpleMongoDbFactory);
        return mongoTemplate;
    }

    public String getHostport() {
        return hostport;
    }

    public void setHostport(String hostport) {
        this.hostport = hostport;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getConnectionsPerHost() {
        return connectionsPerHost;
    }

    public void setConnectionsPerHost(Integer connectionsPerHost) {
        this.connectionsPerHost = connectionsPerHost;
    }

    public Integer getThreadsAllowedToBlockForConnectionMultiplier() {
        return threadsAllowedToBlockForConnectionMultiplier;
    }

    public void setThreadsAllowedToBlockForConnectionMultiplier(Integer threadsAllowedToBlockForConnectionMultiplier) {
        this.threadsAllowedToBlockForConnectionMultiplier = threadsAllowedToBlockForConnectionMultiplier;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getMaxWaitTime() {
        return maxWaitTime;
    }

    public void setMaxWaitTime(Integer maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
    }

    public Boolean getAutoConnectRetry() {
        return autoConnectRetry;
    }

    public void setAutoConnectRetry(Boolean autoConnectRetry) {
        this.autoConnectRetry = autoConnectRetry;
    }

    public Boolean getSocketKeepAlive() {
        return socketKeepAlive;
    }

    public void setSocketKeepAlive(Boolean socketKeepAlive) {
        this.socketKeepAlive = socketKeepAlive;
    }

    public Boolean getSlaveOk() {
        return slaveOk;
    }

    public void setSlaveOk(Boolean slaveOk) {
        this.slaveOk = slaveOk;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public Integer getWriteNumber() {
        return writeNumber;
    }

    public void setWriteNumber(Integer writeNumber) {
        this.writeNumber = writeNumber;
    }

    public Integer getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public Boolean getWriteFsync() {
        return writeFsync;
    }

    public void setWriteFsync(Boolean writeFsync) {
        this.writeFsync = writeFsync;
    }
}
*/
