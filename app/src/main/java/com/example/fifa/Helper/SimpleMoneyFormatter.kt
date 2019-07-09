package com.example.fifa.Helper

interface IMoneyFormatter {
    fun format(value: String): Int
}

class SimpleMoneyFormatter : IMoneyFormatter {
    override fun format(value: String): Int {
        try {
            val cleanedValue = value.trim().removeRange(0, 1)
            val multiplier = when (cleanedValue.last()) {
                'M' -> 1_000_000
                'K' -> 1_000
                else -> 1
            }

            return getAmount(cleanedValue, multiplier)

        } catch (e: Exception) {
            return 0
        }
    }

    private fun getAmount(value: String, multiplier: Int): Int {
        val amount = value.substring(0, value.length - 1).toDouble()
        return (amount * multiplier).toInt()
    }
}