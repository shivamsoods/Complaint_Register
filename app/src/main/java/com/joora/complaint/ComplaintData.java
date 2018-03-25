package com.joora.complaint;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shivam on 25/3/18.
 */

public class ComplaintData {

    private String heading;
    private String mainComplaint;
    private String userId;

    public ComplaintData(String heading, String mainComplaint, String userId) {
        this.heading = heading;
        this.mainComplaint = mainComplaint;
        this.userId = userId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getMainComplaint() {
        return mainComplaint;
    }

    public void setMainComplaint(String mainComplaint) {
        this.mainComplaint = mainComplaint;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("heading", heading);
        result.put("complain", mainComplaint);

        return result;
    }
}
