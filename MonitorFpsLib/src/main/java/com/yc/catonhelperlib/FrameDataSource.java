package com.yc.catonhelperlib;

public class FrameDataSource implements IDataSource {

    public FrameDataSource() {
    }

    public LineChart.LineData createData() {
        float rate = (float)PerformanceManager.getInstance().getLastFrameRate();
        return LineChart.LineData.obtain(rate, Math.round(rate) + "");
    }
}
