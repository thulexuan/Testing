package org.example;

public class Ex1 {
    /**
     * Method tính tổng chi phí cuộc gọi đường dài dựa trên các khoản chiết khấu và cộng thuế
     * @param startTime: thời điểm bắt đầu cuộc gọi
     * @param totalTime: thời lượng cuộc gọi
     * @return: tổng chi phí cuộc gọi
     */
    public static double DummyTel(int startTime, int totalTime) {
        // -1 nghĩa là đầu vào không hợp lệ
        if (startTime < 0 || startTime > 23 || totalTime < 0) {
            return -1;
        }
        double totalMoney = totalTime * 0.5;
        if ((startTime >= 18 && startTime <= 23) || (startTime >= 0 && startTime <= 7)) {
            totalMoney /= 2;
            if (totalTime > 60) {
                totalMoney = totalMoney * 0.85;
            }
        } else {
            if (totalTime > 60) {
                totalMoney = totalMoney * 0.85;
            }
        }
        totalMoney = Math.round(totalMoney * 1.05 * 100.0) / 100.0;
        return totalMoney;
    }
}
