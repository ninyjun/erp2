package com.ninyjun.erp.product.prodsvc.model;

public class ProductSpectacleFrame {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_CODE
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    private Integer spectacleFrameCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_NAME
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    private String spectacleFrameName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_PYM
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    private String spectacleFramePym;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SPECTACLE_FRAME.SPEC
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    private String spec;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_CODE
     *
     * @return the value of PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_CODE
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public Integer getSpectacleFrameCode() {
        return spectacleFrameCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_CODE
     *
     * @param spectacleFrameCode the value for PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_CODE
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public void setSpectacleFrameCode(Integer spectacleFrameCode) {
        this.spectacleFrameCode = spectacleFrameCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_NAME
     *
     * @return the value of PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_NAME
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public String getSpectacleFrameName() {
        return spectacleFrameName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_NAME
     *
     * @param spectacleFrameName the value for PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_NAME
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public void setSpectacleFrameName(String spectacleFrameName) {
        this.spectacleFrameName = spectacleFrameName == null ? null : spectacleFrameName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_PYM
     *
     * @return the value of PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_PYM
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public String getSpectacleFramePym() {
        return spectacleFramePym;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_PYM
     *
     * @param spectacleFramePym the value for PRODUCT_SPECTACLE_FRAME.SPECTACLE_FRAME_PYM
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public void setSpectacleFramePym(String spectacleFramePym) {
        this.spectacleFramePym = spectacleFramePym == null ? null : spectacleFramePym.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SPECTACLE_FRAME.SPEC
     *
     * @return the value of PRODUCT_SPECTACLE_FRAME.SPEC
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public String getSpec() {
        return spec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SPECTACLE_FRAME.SPEC
     *
     * @param spec the value for PRODUCT_SPECTACLE_FRAME.SPEC
     *
     * @mbg.generated Fri Nov 29 10:54:26 CST 2019
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }
}