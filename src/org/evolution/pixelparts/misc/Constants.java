/*
 * Copyright (C) 2023 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.pixelparts.misc;

public class Constants {

    // Power efficient workqueue switch
    public static final String KEY_POWER_EFFICIENT_WORKQUEUE = "power_efficient_workqueue";
    public static final String NODE_POWER_EFFICIENT_WORKQUEUE = "/sys/module/workqueue/parameters/power_efficient";

    // High brightness mode switches
    public static final String KEY_HBM = "hbm";
    public static final String KEY_AUTO_HBM = "auto_hbm";
    public static final String KEY_AUTO_HBM_THRESHOLD = "auto_hbm_threshold";
    public static final String NODE_HBM = "/sys/class/backlight/panel0-backlight/hbm_mode";

    // USB 2.0 fast charge switch
    public static final String KEY_USB2_FAST_CHARGE = "usb2_fast_charge";
    public static final String NODE_USB2_FAST_CHARGE = "/sys/kernel/fast_charge/force_fast_charge";
}
