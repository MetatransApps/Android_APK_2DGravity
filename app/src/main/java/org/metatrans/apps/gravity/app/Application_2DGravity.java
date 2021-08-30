package org.metatrans.apps.gravity.app;


import org.metatrans.apps.gravity.app.Application_Gravity;
import org.metatrans.apps.gravity.cfg.ads.AdsConfigurations_Gravity;
import org.metatrans.commons.ads.api.IAdsConfigurations;
import org.metatrans.commons.cfg.appstore.IAppStore;


public class Application_2DGravity extends Application_Gravity {


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}


	protected IAdsConfigurations adsConfigurations 	= new AdsConfigurations_Gravity(this);


	@Override
	public IAdsConfigurations getAdsConfigurations() {
		return adsConfigurations;
	}
}
