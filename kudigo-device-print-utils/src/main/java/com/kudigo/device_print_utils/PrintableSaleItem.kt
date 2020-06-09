package com.kudigo.device_print_utils

import java.util.*
import kotlin.collections.ArrayList

class PrintableSaleItem(
    var id: String,
    var customerName: String? = null,
    var customerNumber: String? = null,
    var currency: String = "",
    var grossTotal: Double = 0.00,
    var totalCost: Double = 0.0,
    var discountOffered: Double = 0.0,
    var cashTendered: Double = 0.0,
    var cashBalance: Double = 0.0,
    var paymentMethod: String? = null,
    var paymentStatus: String? = null,
    var nextPaymentDate: Date? = null,
    var amountOwing: Double = 0.00,
    var vatValue: Double = 0.00,
    var doubleCheckoutCode: String = "",
    var itemsPurchased: ArrayList<SaleItem> = ArrayList<SaleItem>(),
    var agentUtil: DeviceAgentUtil,
    var shopUtil: DeviceShopUtil

)