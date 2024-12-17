//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.tests.setup;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.amdocs.digital.ms.coe.dashboard.business.constants.Constants;
import com.amdocs.digital.ms.coe.dashboard.business.internationalization.interfaces.IMessages;
import com.amdocs.msb.asyncmessaging.json.AsyncMessagingObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestConfig.class},
                properties = { "server.port=0", "management.server.port=0", "logging.level.com.couchbase=ERROR" })
public abstract class TestSetUp {

    @Value("${enabledBy}")
    String enabledBy;

    @Inject
    IMessages messages;

    @Mock
    HttpServletRequest httpServletRequest;

    @Inject
    AuthenticationManager authenticationManager;

    @Inject
    public AsyncMessagingObjectMapper mapper;
    
    public static final byte getDefaultByteValue()
    {
        return 0;
    }

    public static final char getDefaultCharValue()
    {
        return 'A';
    }
    
    public static final char getDefaultCharacterValue()
    {
        return getDefaultCharValue();
    }

    public static final short getDefaultShortValue()
    {
        return 0;
    }

    public static final int getDefaultIntegerValue()
    {
        return getDefaultIntValue();
    }
    
    public static final int getDefaultIntValue()
    {
        return 0;
    }

    public static final long getDefaultLongValue()
    {
        return 0;
    }

    public static final float getDefaultFloatValue()
    {
        return 0f;
    }

    public static final double getDefaultDoubleValue()
    {
        return 0.1;
    }

    public static final boolean getDefaultBooleanValue()
    {
         return false;
    }

    public static final String getDefaultStringValue()
    {
         return "default";
    }
    
}