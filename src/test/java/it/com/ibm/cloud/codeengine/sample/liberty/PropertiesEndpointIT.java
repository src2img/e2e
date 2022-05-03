package com.ibm.cloud.codeengine.sample.liberty;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.json.JsonObject;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

public class PropertiesEndpointIT {

  @Test
  public void testGetProperties() {

      // system properties
      String port = System.getProperty("http.port");
      String contextRoot = System.getProperty("context.root", "/");
      String url = "http://localhost:" + port + contextRoot;

      // client setup
      Client client = ClientBuilder.newClient();

      // request
      WebTarget target = client.target(url + "/system/properties");
      Response response = target.request().get();

      // response
      assertEquals(200, response.getStatus(), "Incorrect response code from " + url);

      JsonObject obj = response.readEntity(JsonObject.class);

      response.close();
      client.close();
  }
}
