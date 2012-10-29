/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version ${license.version})
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.common.service;

import java.util.List;

import fr.hoteia.qalingo.core.common.domain.Localization;

public interface LocalizationService {

	Localization getLocalizationById(String localizationId);
	
	Localization getLocalizationByLocaleCode(String localeCode);
	
	List<Localization> findLocalization(Localization criteria);
	
	void saveOrUpdateLocalization(Localization localization);
	
	void deleteLocalization(Localization localization);

}