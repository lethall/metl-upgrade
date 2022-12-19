/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.metl.core.plugin;

import java.util.List;
import java.util.Set;

import org.jumpmind.metl.core.plugin.XMLComponentDefinition.ResourceCategory;

public interface IDefinitionFactory {

    public void refresh();
    
    public void refresh(String projectVersionId);
    
    public XMLComponentDefinition getComponentDefinition(String projectVersionId, String id);
    
    public List<XMLComponentDefinition> getComponentDefinitions(String projectVersionId);
    
    public XMLResourceDefinition getResourceDefintion(String projectVersionId, String id);
    
    public Set<String> getResourceCategories(String projectVersionId);    
    
    public Set<XMLResourceDefinition> getResourceDefinitions(String projectVersionId, ResourceCategory resourceCategory);    

}