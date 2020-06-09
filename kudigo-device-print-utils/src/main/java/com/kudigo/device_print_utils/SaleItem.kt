package com.kudigo.device_print_utils

/**
 * @author Bright Ahedor
 * @param id, the unique identifier of the sale item
 * @param name, the name of the item sold
 * @param unitName, the ame of the selling unit, default to "item"
 * @param sellingPrice, the selling  price of the item
 * @param quantity, the quantity of the item in purchase, default to 1.0
 */
class SaleItem(
    var id: String = "",
    var name: String,
    var unitName: String = "Item",
    var sellingPrice: Double,
    var quantity: Double? = 1.0

)