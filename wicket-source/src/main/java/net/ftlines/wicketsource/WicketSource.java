package net.ftlines.wicketsource;

import org.apache.wicket.Application;

/**
 * Preferred entry point for app-developer use in initializing WicketSource, as
 * compatibility can be maintained across wicket versions.
 * @author Jenny Brown
 *
 */
public class WicketSource {

	/**
	 * Preferred entry point for configuring your WicketApplication automatically.
	 * @param application Your wicket application
	 */
	public static void configure(Application application)
	{
        application.addComponentInstantiationListener(new AttributeModifyingInstantiationListener());
        application.addComponentOnBeforeRenderListener(new AttributeModifyingComponentVisitor());
// Below is 1.5 syntax for diff convenience.
//		application.getComponentInstantiationListeners().add(new AttributeModifyingInstantiationListener());
//		application.getComponentPostOnBeforeRenderListeners().add(new AttributeModifyingComponentVisitor());
	}

}
