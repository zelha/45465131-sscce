package org.test;

import com.vaadin.annotations.Theme;
import com.vaadin.external.org.slf4j.LoggerFactory;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.embedded.VaadinUIComponent;

/**
 * @author Alejandro Duarte
 */
@Theme(ValoTheme.THEME_NAME)
public class HostUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VaadinUIComponent ui1 = new VaadinUIComponent("http://localhost:9030");
        ui1.setSizeFull();
        
//		VaadinSession session = ui1.getUI().getSession();
//		LoggerFactory.getLogger(HostUI.class).debug((session ==null  )? "empty" :"notempty");
//        VaadinService service = session.getService();
//        @SuppressWarnings("unused")String path = service.getBaseDirectory().getAbsolutePath();
//        LoggerFactory.getLogger(HostUI.class).debug((path ==null || path.isEmpty())? "empty" :path);
        
        VaadinUIComponent ui2 = new VaadinUIComponent("http://localhost:9020");
        ui2.setSizeFull();
        
        HorizontalSplitPanel split = new HorizontalSplitPanel(ui1, ui2);
        split.setSizeFull();
        setContent(split);
    }

}
