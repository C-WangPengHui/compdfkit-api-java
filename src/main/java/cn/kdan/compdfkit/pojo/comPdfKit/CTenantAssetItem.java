//  Copyright © 2014-2023 PDF Technologies, Inc. All Rights Reserved.
//
//  THIS SOURCE CODE AND ANY ACCOMPANYING DOCUMENTATION ARE PROTECTED BY INTERNATIONAL COPYRIGHT LAW
//  AND MAY NOT BE RESOLD OR REDISTRIBUTED. USAGE IS BOUND TO THE ComPDFKit LICENSE AGREEMENT.
//  UNAUTHORIZED REPRODUCTION OR DISTRIBUTION IS SUBJECT TO CIVIL AND CRIMINAL PENALTIES.
//  This notice may not be removed from this file.

package cn.kdan.compdfkit.pojo.comPdfKit;

public class CTenantAssetItem {
    private String assetTypeName;
    private int withholdingAsset;
    private int asset;

    public String getAssetTypeName() {
        return assetTypeName;
    }

    public void setAssetTypeName(String assetTypeName) {
        this.assetTypeName = assetTypeName;
    }

    public int getWithholdingAsset() {
        return withholdingAsset;
    }

    public void setWithholdingAsset(int withholdingAsset) {
        this.withholdingAsset = withholdingAsset;
    }

    public int getAsset() {
        return asset;
    }

    public void setAsset(int asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return "TenantAssetItem{" +
                "assetTypeName='" + assetTypeName + '\'' +
                ", withholdingAsset=" + withholdingAsset +
                ", asset=" + asset +
                '}';
    }
}
