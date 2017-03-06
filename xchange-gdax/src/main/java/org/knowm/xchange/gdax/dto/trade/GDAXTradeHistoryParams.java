package org.knowm.xchange.gdax.dto.trade;

import org.knowm.xchange.service.trade.params.TradeHistoryParams;

public class GDAXTradeHistoryParams implements TradeHistoryParams {

  //Setting default value to "all" so some trades are returned by default, instead of an error message.
  String orderId = "all";

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
}
