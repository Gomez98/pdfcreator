package com.yohersa.controller;

import com.yohersa.model.QRCode;
import com.yohersa.service.QRCodeService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/qrcode")
@AllArgsConstructor
public class QRCodeController {

    private final QRCodeService qrCodeService;

    @PostMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] generateQRCode(@RequestBody QRCode qrCode) {
       return qrCodeService.generateQRCode(qrCode);
    }
}