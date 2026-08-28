package com.mycompany.imagemethods;

/**
 * Bai 3.1.2 + 3.1.7 - Methods for Classes
 *
 * @author Nuri
 */
public class Image {
    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // 3.1.2 #1: xac dinh anh cao hon rong hay khong
    public boolean isPortrait() {
        return this.height > this.width;
    }

    // 3.1.2 #2: tinh so pixel cua anh
    public int size() {
        return this.width * this.height;
    }

    // 3.1.2 #3: xac dinh anh nay co nhieu pixel hon anh kia khong
    public boolean isLarger(Image other) {
        return this.size() > other.size();
    }

    // 3.1.7: tra ve "small"/"medium"/"large" tuy so pixel
    public String sizeString() {
        int pixels = this.size();
        if (pixels <= 10000) {
            return "small";
        } else if (pixels <= 1000000) {
            return "medium";
        } else {
            return "large";
        }
    }
}
