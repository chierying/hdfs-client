package com.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by v_zhangbing on 2017/7/4.
 */
public class HdfsClientTest {

    private Configuration conf;
    private FileSystem fs;

    @Before
    public void init() throws URISyntaxException, IOException, InterruptedException {
        conf = new Configuration();
        //conf.set("fs.defaultFS","hdfs://ubuntu:9000");

        fs = FileSystem.get(new URI("hdfs://ubuntu:9000"), conf, "zb");
    }

    @Test
    public void testUploadFile() throws IOException {
        fs.copyFromLocalFile(new Path("C:/Users/zb/tmp/a.txt"), new Path("/java/a.txt"));
        fs.close();
    }


}
