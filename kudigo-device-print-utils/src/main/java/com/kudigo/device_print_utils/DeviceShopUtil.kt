package com.kudigo.device_print_utils

/**
 * @author Bright Ahedor
 * @param id, a dummy id of the shop, not shown but just a unique identifier
 * @param businessName, the nname of the shop to display on the print out
 * @param businessCurrency, the currency that is shown on the print out
 * @param vatNo, the vat number of the shop, default is empty
 * @param taxNo, the taxation number of the shop default is empty.
 */
class DeviceShopUtil(
    var id: String,
    var businessName: String,
    var businessCurrency: String,
    var vatNo: String = "",
    var taxNo: String
)