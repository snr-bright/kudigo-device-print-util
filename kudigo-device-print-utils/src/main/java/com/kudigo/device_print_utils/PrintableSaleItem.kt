package com.kudigo.device_print_utils

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author Bright Ahedor
 * @constructor PrintableSaleItem, with all these params
 * @param id, a unique identifier of the print, it is used as the number of the receipt
 * @param customerName, the name of the customer
 * @param customerNumber, the number of the customer
 * @param currency, the currency of purchase
 * @param grossTotal, the total value less the discount and tax
 * @param totalCost, the total cost of items
 * @param discountOffered, the total value of discount offered on purchase
 * @param cashTendered, the cash user provided
 * @param cashBalance, balance received by customer
 * @param paymentMethod, a string of the method used in purchase
 * @param nextPaymentDate, the next payment date for credit payments
 * @param amountOwing, amount the customer is owing
 * @param vatValue, the total VAT value
 * @param checkoutCode, in some cases where there a checkout code
 * @param itemsPurchased, list of items purchase by customer
 * @param agentUtil, details of the agent using the device
 * @param shopUtil, detail of the shop
 */
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
    var nextPaymentDate: Date? = null,
    var amountOwing: Double = 0.00,
    var vatValue: Double = 0.00,
    var checkoutCode: String = "",
    var itemsPurchased: ArrayList<SaleItem> = ArrayList<SaleItem>(),
    var agentUtil: DeviceAgentUtil,
    var shopUtil: DeviceShopUtil

)