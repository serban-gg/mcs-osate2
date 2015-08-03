package org.osate.xtext.aadl2.mcs.ui;

import org.osate.xtext.aadl2.mcs.ui.internal.MCSActivator;

import org.apache.log4j.Logger;
import org.osate.core.OsateCorePlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;

public class MCSActualActivator extends MCSActivator {
	 @Override
	    public void start(BundleContext context) throws Exception {
	        super.start(context);
	        try {
	            registerInjectorFor(ORG_OSATE_XTEXT_AADL2_MCS_MCS);
	        } catch (Exception e) {
	            Logger.getLogger(getClass()).error(e.getMessage(), e);
	            throw e;
	        }
	        Logger.getLogger(getClass()).info("MCS UI plugin activated");
	    }
	    @Override
	    public Injector getInjector(String languageName) {
	        return OsateCorePlugin.getDefault().getInjector(languageName);
	    }
	    protected void registerInjectorFor(String language) throws Exception {
	        OsateCorePlugin.getDefault().registerInjectorFor(language, createInjector(language));
	    }
}
