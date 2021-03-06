/**
 * Copyright 2014 SAP AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.spotter.eclipse.ui.model;

import org.spotter.eclipse.ui.model.xml.IModelWrapper;

/**
 * A factory to produce {@link IExtensionItem}.
 * 
 * @author Denis Knoepfle
 * 
 */
public interface IExtensionItemFactory {

	/**
	 * Creates an extension item with no children and no model.
	 * 
	 * @return the newly created extension item
	 */
	IExtensionItem createExtensionItem();

	/**
	 * Creates an extension item with no parent and the given model.
	 * 
	 * @param modelWrapper
	 *            the model wrapper for this item
	 * @return the newly created extension item
	 */
	IExtensionItem createExtensionItem(IModelWrapper modelWrapper);

	/**
	 * Creates an extension item under the given parent.
	 * 
	 * @param parent
	 *            the parent of this item
	 * @param modelWrapper
	 *            the model wrapper for this item
	 * @return the newly created extension item
	 */
	IExtensionItem createExtensionItem(IExtensionItem parent, IModelWrapper modelWrapper);

}
