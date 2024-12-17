package com.amdocs.digital.ms.coe.dashboard.testpact.pactconsumer;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;

@RunWith(SpringRunner.class)
// Instruction
// Uncomment the following when Provider1's client is generated by swagger.
//@@ImportAutoConfiguration(classes={Feign.Builder.class, ProductOrderApiConfig.class, com.amdocs.msbase.resource.lock.config.MsbResourceOptimisticLocksMappingConfig.class})

// Instruction
// 1. Look inside Provider1ApiConfig.java for the correct spelling of "services.provider1.url" 
@TestPropertySource(properties = "services.provider1.url=http://127.0.0.1:8899/provider1-management")
public class ThisServiceProvider1PactGenTest 
{
	public static final String CONSUMER = "Dashboard";
	public static final String PROVIDER = "Provider1";

    @Rule
    public PactProviderRuleMk2 rule = new PactProviderRuleMk2(PROVIDER, "127.0.0.1", 8899, this);
    
// Instruction:
// Once the Provider1's client is generated by swagger, uncomment this line
//    @Inject
//    Provider1Api client;
    
    @Pact(provider=PROVIDER, consumer=CONSUMER)
    public RequestResponsePact createFragment(PactDslWithProvider builder) {
    	Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");

// Instruction: 
// 1. Locate the swagger.yaml of the Provider service (not this service!!!)
// 2. Locate the operations in the swagger.yaml.
// 3. Identify the operations this service calls.
// 3. For each operation, implement at least one Interaction below.
// The followin sample code is for from self-service. It calls all 4 operations of shopping-cart.
        		// ==================================================================
        		// 1. POST, /v1/shopping-carts, req=ShoppingCart, resp=ShoppingCart
        		//.given( "emptyDb") 
        		//.uponReceiving("This service create shopping cart with one items in cart")
                //.path(path1)
                //.query(query1)
                //.method("POST")
                //.headers(headers)
                //.body( httpTextOf( reqSc1()))
                //.willRespondWith()
                //.status(200)
                //.headers(headers)
                //.body( respSc1())
        		// ==================================================================
        		// 2. GET, /v1/shopping-carts, resp=[ShoppingCart]
                // desc: This service retrieves shopping carts for given filer criteria.
                // TODO unimplemented yet
        		// ==================================================================
        		// 3. GET, /v1/shopping-carts/{shoppingCartId}, resp=ShoppingCart
        		// ==================================================================
        		// 4. PATCH, /v1/shopping-carts/{shoppingCartId}, req=PatchElement, resp=ShoppingCart
                // desc: This service allows partial update shopping cart resource it includes adding, removing, updating items in cart. It can also use to update state, valid for for cart and state, quantity of cart item.
                // TODO unimplemented yet
                //.toPact();
		// A functional no-op example
		return builder
                // GET "ShoppingCartById?id=1"
        		.uponReceiving("fetch shopping cart by id")
                .path(path)
                .method("GET")
                .query("id=1")
                .willRespondWith()
                .status(200)
                .headers(headers)
                .body( "{}")
                .toPact();
    }

	//////////////////////////////////////////////////////////////
	// Paths and queries
//	String path1 = "/shoppingcart-management/v1/shopping-carts";
//	String query1 = "salesChannel=operation";
	String path = "/dummyPath";

	//////////////////////////////////////////////////////////////
	// Requests

//	private V1ShoppingCart reqSc1() {
//		return new V1ShoppingCart()
//				.addShoppingCartItemItem(shoppingCartItem1())
//				;
//	}
	 
	//////////////////////////////////////////////////////////////
	// Responses
	 
	 private DslPart respSc1() {
//		 DslPart body = new PactDslJsonBody()
//				 .stringMatcher("id", "ShoppingCart_[0-9]*", "ShoppingCart_000000000")
//				 .eachLike("shoppingCartItem")
//				 .numberValue("quantity", 1)
//				 .stringMatcher("state", "[A-Za-z]*", "new")
//				 .object("productOffering")
//				 .stringMatcher("id", "[A-Za-z0-9_]*", "IPHONE_7")
//				 .stringMatcher("name", "[A-Za-z0-9_]*", "iPhone")
//				 .closeObject()
//				 .closeObject()
//				 .closeArray();
//		 return body;
		return null;
	}
	
	 
	//////////////////////////////////////////////////////////////
	@Test
	@PactVerification(PROVIDER)
	public void runTest() {
// Instruction:
// 1. For each Interaction implemented in createFragment(), implement a call here.
// 2. The sample code uses RestTemplate to make the calls.
// 3. Ideally, you need to make real Swagger client calls. 		
    	
        // ==================================================================
        // 1. POST, /v1/shopping-carts, req=ShoppingCart, resp=ShoppingCart
        // V1ShoppingCart resp1 = client.createShoppingCart("operation", reqSc1(), null);
        // ==================================================================
        // 2. GET, /v1/shopping-carts, resp=[ShoppingCart]
        // desc: This service retrieves shopping carts for given filer crit.eria.
        // TODO unimplemented yet
        // ==================================================================
        // 3. GET, /v1/shopping-carts/{shoppingCartId}, resp=ShoppingCart
        // V1ShoppingCart resp3 = client.getShoppingCart("operation", "ShoppingCart_000000000", null); 
        // ==================================================================
        // 4. PATCH, /v1/shopping-carts/{shoppingCartId}, req=PatchElement, resp=ShoppingCart
        // desc: This service allows partial update shopping cart resource it includes adding, removing, updating items in cart. It can also use to update state, valid for for cart and state, quantity of cart item.
        // TODO unimplemented yet
        // ==================================================================
        // 5. GET, /v1/shopping-carts/{shoppingCartId}, resp=ShoppingCart
        // This is negative test, There will be an exception for shopping cart not found!!!
        // try {
        //      V1ShoppingCart resp5 = client.getShoppingCart("operation", "ShoppingCart_000000088", null);
        // } catch (ShoppingCartExternalClientException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // ==================================================================
        // 6. POST (Case 1 with 2 items), /v1/shopping-carts, req=ShoppingCart, resp=ShoppingCart
        // V1ShoppingCart resp6 = client.createShoppingCart("operation", reqSc6(), null);
        
        // A functional no-op example:
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://127.0.0.1:8899";
        String resp = restTemplate.getForObject(url + path + "?id={id}", String.class, 1);
        assertNotNull(resp);
    }
    
	////////////////////////////////////////////////////////////////////////
	// Utilities

	// Although Pact accepts JSONObject, its internal conversion does not match RestTemplate!
	// This converts object the same way as RestTemplate.
    private String httpTextOf( Object o) {
    	MappingJackson2HttpMessageConverter conv = new MappingJackson2HttpMessageConverter();
    	HttpOutputMessage outputMessage = new MockHttpOutputMessage();
    	try {
			conv.write( o, o.getClass(), null, outputMessage);
			System.out.println(outputMessage.getBody().toString());
			return outputMessage.getBody().toString();
		} catch (HttpMessageNotWritableException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
