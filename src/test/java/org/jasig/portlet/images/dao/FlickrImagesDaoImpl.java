/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portlet.images.dao;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class FlickrImagesDaoImpl {
    
    String jsonResponse = "{\"photos\":{\"page\":1, \"pages\":1, \"perpage\":100, \"total\":\"1\", \"photo\":[{\"id\":\"7042444615\", \"owner\":\"23311795@N04\", \"secret\":\"4b1d264cb1\", \"server\":\"7059\", \"farm\":8, \"title\":\"2012 Jasig Sakai Conference logo\", \"ispublic\":1, \"isfriend\":0, \"isfamily\":0}]}, \"stat\":\"ok\"}";    
    FlickrImagesDao dao = new FlickrImagesDao();

    @Test
    public void test() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        @SuppressWarnings("unchecked")
        Map<String,Object> response = mapper.readValue(jsonResponse, Map.class);
        List<String> urls = dao.buildList(response);
        assertEquals(1, urls.size());
    }
    
}
