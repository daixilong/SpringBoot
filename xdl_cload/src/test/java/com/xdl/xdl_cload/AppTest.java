package com.xdl.xdl_cload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

@EnableBinding(value={AppTest.SinkSender.class})
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    @Autowired
    private SinkSender sinkSender;
    
    public void testApp()
    {
    	sinkSender.output().send(MessageBuilder.withPayload("hello,今天的天气真的很好").build());
    }
    
    public interface SinkSender{
    	String OUTPUT = "input";
    	@Output(SinkSender.OUTPUT)
    	MessageChannel output();
    }
}
