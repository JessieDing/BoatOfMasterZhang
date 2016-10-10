package com.company;

import java.util.List;

/**
 * Created by Woody on 2016/10/10.
 */
public class ArchDetector {
    public String detect(List<Arch> arches){
        boolean isImpossable = arches.stream().allMatch(arch -> arch.getHeight() < 50);
        if (isImpossable) {
            return "IMPASSABLE";
        }
        for (Arch arch : arches) {
            if (arch.getHeight() >= 50) {
                return "PASS " + "首条可过船水路的桥洞高度：" + arch.getHeight();
            }
        }
        return "";
    }
}
