package com.gravityplay.app;


import com.apps.mobile.android.commons.ads.api.IAdsConfigurations;
import com.apps.mobile.android.commons.cfg.appstore.IAppStore;
import com.gravityplay.cfg.ads.AdsConfigurations_Gravity;


public class Application_Gravity_AdsHome extends Application_Gravity {


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
