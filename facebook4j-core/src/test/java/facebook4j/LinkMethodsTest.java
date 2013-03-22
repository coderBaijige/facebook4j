/*
 * Copyright 2012 Ryuji Yamashita
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package facebook4j;

import org.junit.*;

import java.net.URL;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class LinkMethodsTest extends FacebookTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void getLinks_me() throws Exception {
        ResponseList<Link> links = facebook1.getLinks();
        assertThat(links, is(notNullValue()));
        for (Link link : links) {
            System.out.println(link);
        }
    }
    
    @Test
    public void getLinks_id() throws Exception {
        String pageId = "19292868552"; //The Page for Facebook Platform
        ResponseList<Link> links = facebook1.getLinks(pageId);
        assertThat(links, is(notNullValue()));
        for (Link link : links) {
            System.out.println(link);
        }
    }

}
