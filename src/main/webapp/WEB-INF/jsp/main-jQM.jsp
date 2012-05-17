<%--

    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.

--%>

<jsp:directive.include file="/WEB-INF/jsp/include.jsp"/>
<style type="text/css">
    .image-grid ul {
        list-style: none;
        margin: 0;
        padding: 0;
    }
    
    .image-grid li {
        display: block;
        float: left;
        margin: 0px 3px 3px 3px;
        padding: 0;
    }
        
    /* iphone */
    @media only screen and (max-device-width: 480px) {
        .image-grid img {
            width: 70px;
            height: 70px;
        }
    }
</style>


<div class="portlet">
    <div data-role="content" class="portlet-content image-grid">

        <ul>
            <c:forEach items="${ images }" var="image">
                <li><img src="${ image }"/></li>
            </c:forEach>
        </ul>
   
    </div>
</div>