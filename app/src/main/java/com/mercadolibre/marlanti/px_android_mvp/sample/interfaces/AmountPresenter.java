package com.mercadolibre.marlanti.px_android_mvp.sample.interfaces;

import com.mercadolibre.marlanti.px_android_mvp.sample.view.AmountView;

import java.math.BigDecimal;

/**
 * Created by marlanti on 12/28/16.
 */
public interface AmountPresenter{

    void informAmount(BigDecimal amount);

    void validateAmount();

}