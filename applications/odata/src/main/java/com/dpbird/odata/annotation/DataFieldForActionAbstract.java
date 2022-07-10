package com.dpbird.odata.annotation;

public class DataFieldForActionAbstract extends DataFieldAbstract{
    private boolean inline = false;
    private boolean determining = false;

    public boolean isInline() {
        return inline;
    }

    public void setInline(boolean inline) {
        this.inline = inline;
    }

    public boolean isDetermining() {
        return determining;
    }

    public void setDetermining(boolean determining) {
        this.determining = determining;
    }
}
