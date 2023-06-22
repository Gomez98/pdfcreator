package com.yohersa.service.impl;

import com.yohersa.model.QRCode;
import com.yohersa.service.QRCodeService;
import com.yohersa.util.QRCodeGenerator;
import org.springframework.stereotype.Service;

@Service
public class QRCodeServiceImpl implements QRCodeService {

    @Override
    public byte[] generateQRCode(QRCode qrCode) {
        try {
            QRCodeGenerator qrCodeGenerator = new QRCodeGenerator();

            return qrCodeGenerator.generateQRCode(qrCode.toString(), 300, 300);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
