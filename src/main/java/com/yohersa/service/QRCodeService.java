package com.yohersa.service;

import com.yohersa.model.QRCode;

public interface QRCodeService {

    byte[] generateQRCode(QRCode qrCode);
}
