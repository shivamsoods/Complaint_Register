package com.joora.complaint;

/**
 * Created by HP on 24-03-2018.
 */

public class historyItem {

    private String mHeading;
    private String mComplaint;

    public historyItem(String heading,String complaint){
        mHeading=heading;
        mComplaint=complaint;
    }


    public String getHeading() {
        return mHeading;
    }

    public void setHeading(String mHeading) {
        this.mHeading = mHeading;
    }

    public String getComplaint() {
        return mComplaint;
    }

    public void setComplaint(String mComplaint) {
        this.mComplaint = mComplaint;
    }
}
