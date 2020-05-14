/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models.datalayer;

/**
 * Interface defining data for page components.
 *
 * @since com.adobe.cq.wcm.core.components.models.datalayer 1.0.0
 */
public interface PageData extends ContainerData {

    /**
     * Returns the page tags used in the data layer
     *
     * @return tags array
     *
     * @since com.adobe.cq.wcm.core.components.models.datalayer 1.0.0
     */
    default String[] getTags() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the page URL used in the data layer
     *
     * @return link URL
     *
     * @since com.adobe.cq.wcm.core.components.models.datalayer 1.0.0
     */
    default String getUrl() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the page template used in the data layer
     *
     * @return JCR template path
     *
     * @since com.adobe.cq.wcm.core.components.models.datalayer 1.0.0
     */
    default String getTemplatePath() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the page language used in the data layer
     *
     * @return language
     *
     * @since com.adobe.cq.wcm.core.components.models.datalayer 1.0.0
     */
    default String getLanguage() {
        throw new UnsupportedOperationException();
    }

}
