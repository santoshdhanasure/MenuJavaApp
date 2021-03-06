/*
 * #%L
 * BroadleafCommerce Menu
 * %%
 * Copyright (C) 2009 - 2014 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.menu.dao;

import org.broadleafcommerce.menu.domain.Menu;
import org.broadleafcommerce.menu.domain.MenuItem;
import java.util.List;

public interface MenuDao {

    public List<Menu> readAllMenus();

    public List<MenuItem> readAllMenuItems();

    public Menu readMenuById(Long menuId);

    public MenuItem readMenuItemById(Long menuItemId);

    public Menu readMenuByName(String menuName);

    public Menu saveMenu(Menu menu);

    public MenuItem saveMenuItem(MenuItem menuItem);

}