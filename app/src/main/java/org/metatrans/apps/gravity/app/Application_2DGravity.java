package org.metatrans.apps.gravity.app;


import org.metatrans.apps.gravity.cfg.ads.AdsConfiguration_Gravity;
import org.metatrans.commons.ads.api.IAdsProviders;
import org.metatrans.commons.ads.impl.AdsConfigurations_DynamicImpl;
import org.metatrans.commons.cfg.appstore.IAppStore;


public class Application_2DGravity extends Application_Gravity {


	@Override
	public void onCreate() {

		super.onCreate();

		getAdsConfigurations().addProviderConfig(
				IAdsProviders.ID_HOME_ADS,
				new AdsConfiguration_Gravity()
		);
	}


	@Override
	public AdsConfigurations_DynamicImpl getAdsConfigurations() {

		return (AdsConfigurations_DynamicImpl) super.getAdsConfigurations();
	}


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}
}
