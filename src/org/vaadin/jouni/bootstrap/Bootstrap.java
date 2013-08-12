package org.vaadin.jouni.bootstrap;

public interface Bootstrap {

    public enum Typography {
        H1, H2, H3, H4, H5, H6, BODYCOPY, LEAD, SMALL, TEXT_LEFT, TEXT_CENTER, TEXT_RIGHT, TEXT_MUTED, TEXT_PRIMARY, TEXT_WARNING, TEXT_DANGER, TEXT_SUCCESS, TEXT_INFO;
        public String styleName() {
            return toString().toLowerCase().replaceAll("_", "-");
        }
    }

    public enum Tables {
        STRIPED, BORDERED, HOVER, CONDENSED;
        public String styleName() {
            return toString().toLowerCase().replaceAll("_", "-");
        }
    }

    public enum Forms {
        FORM;
        public String styleName() {
            return toString().toLowerCase().replaceAll("_", "-");
        }
    }

    public enum Buttons {
        DEFAULT, PRIMARY, INFO, SUCCESS, WARNING, DANGER, LINK;
        public String styleName() {
            return toString().toLowerCase().replaceAll("_", "-");
        }
    }
}
