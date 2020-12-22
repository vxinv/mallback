package com.lixin.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LitemallCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LitemallCouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public static Criteria newAndCreateCriteria() {
        LitemallCouponExample example = new LitemallCouponExample();
        return example.createCriteria();
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public LitemallCouponExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public LitemallCouponExample orderBy(String... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public LitemallCouponExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public LitemallCouponExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public static class Criteria extends GeneratedCriteria {
        private LitemallCouponExample example;

        protected Criteria(LitemallCouponExample example) {
            super();
            this.example = example;
        }

        public LitemallCouponExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andDeletedEqualTo(LitemallCoupon.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(LitemallCoupon.Deleted.IS_DELETED.value());
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public interface IExampleWhen {
        void example(com.lixin.litemall.db.domain.LitemallCouponExample example);
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> goodsValueCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            goodsValueCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getGoodsValueCriteria() {
            return goodsValueCriteria;
        }

        protected void addGoodsValueCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            goodsValueCriteria.add(new Criterion(condition, value, "com.lixin.litemall.db.mybatis.JsonIntegerArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addGoodsValueCriterion(String condition, Integer[] value1, Integer[] value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            goodsValueCriteria.add(new Criterion(condition, value1, value2, "com.lixin.litemall.db.mybatis.JsonIntegerArrayTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                    || goodsValueCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(goodsValueCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`name` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`name` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`name` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`name` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`name` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`name` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("`desc` is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("`desc` is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("`desc` =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`desc` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("`desc` <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`desc` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("`desc` >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`desc` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("`desc` >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`desc` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("`desc` <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`desc` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("`desc` <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`desc` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("`desc` like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("`desc` not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("`desc` in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("`desc` not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("`desc` between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("`desc` not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("tag = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("tag <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("tag > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("tag >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("tag < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("tag <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("total = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("total <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("total > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("total >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("total < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("total <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("discount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("discount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("discount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("discount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("discount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("discount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andMinIsNull() {
            addCriterion("`min` is null");
            return (Criteria) this;
        }

        public Criteria andMinIsNotNull() {
            addCriterion("`min` is not null");
            return (Criteria) this;
        }

        public Criteria andMinEqualTo(BigDecimal value) {
            addCriterion("`min` =", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`min` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinNotEqualTo(BigDecimal value) {
            addCriterion("`min` <>", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`min` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinGreaterThan(BigDecimal value) {
            addCriterion("`min` >", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`min` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`min` >=", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`min` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinLessThan(BigDecimal value) {
            addCriterion("`min` <", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`min` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`min` <=", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`min` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMinIn(List<BigDecimal> values) {
            addCriterion("`min` in", values, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotIn(List<BigDecimal> values) {
            addCriterion("`min` not in", values, "min");
            return (Criteria) this;
        }

        public Criteria andMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`min` between", value1, value2, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`min` not between", value1, value2, "min");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("`limit` is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("`limit` is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Short value) {
            addCriterion("`limit` =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`limit` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Short value) {
            addCriterion("`limit` <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`limit` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Short value) {
            addCriterion("`limit` >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`limit` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Short value) {
            addCriterion("`limit` >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`limit` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Short value) {
            addCriterion("`limit` <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`limit` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Short value) {
            addCriterion("`limit` <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`limit` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Short> values) {
            addCriterion("`limit` in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Short> values) {
            addCriterion("`limit` not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Short value1, Short value2) {
            addCriterion("`limit` between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Short value1, Short value2) {
            addCriterion("`limit` not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`type` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`type` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`type` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`type` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`type` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`type` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`status` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Short value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Short value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Short value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Short value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Short value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Short> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Short> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Short value1, Short value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Short value1, Short value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNull() {
            addCriterion("goods_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNotNull() {
            addCriterion("goods_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueEqualTo(Integer[] value) {
            addGoodsValueCriterion("goods_value =", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_value = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotEqualTo(Integer[] value) {
            addGoodsValueCriterion("goods_value <>", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_value <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThan(Integer[] value) {
            addGoodsValueCriterion("goods_value >", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_value > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThanOrEqualTo(Integer[] value) {
            addGoodsValueCriterion("goods_value >=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_value >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThan(Integer[] value) {
            addGoodsValueCriterion("goods_value <", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_value < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThanOrEqualTo(Integer[] value) {
            addGoodsValueCriterion("goods_value <=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("goods_value <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoodsValueLike(Integer[] value) {
            addGoodsValueCriterion("goods_value like", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotLike(Integer[] value) {
            addGoodsValueCriterion("goods_value not like", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIn(List<Integer[]> values) {
            addGoodsValueCriterion("goods_value in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotIn(List<Integer[]> values) {
            addGoodsValueCriterion("goods_value not in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueBetween(Integer[] value1, Integer[] value2) {
            addGoodsValueCriterion("goods_value between", value1, value2, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotBetween(Integer[] value1, Integer[] value2) {
            addGoodsValueCriterion("goods_value not between", value1, value2, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNull() {
            addCriterion("time_type is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("time_type is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualTo(Short value) {
            addCriterion("time_type =", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("time_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualTo(Short value) {
            addCriterion("time_type <>", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("time_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThan(Short value) {
            addCriterion("time_type >", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("time_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("time_type >=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("time_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThan(Short value) {
            addCriterion("time_type <", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("time_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(Short value) {
            addCriterion("time_type <=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("time_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeTypeIn(List<Short> values) {
            addCriterion("time_type in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotIn(List<Short> values) {
            addCriterion("time_type not in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeBetween(Short value1, Short value2) {
            addCriterion("time_type between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotBetween(Short value1, Short value2) {
            addCriterion("time_type not between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("`days` is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("`days` is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Short value) {
            addCriterion("`days` =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`days` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Short value) {
            addCriterion("`days` <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`days` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Short value) {
            addCriterion("`days` >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`days` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("`days` >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`days` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Short value) {
            addCriterion("`days` <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`days` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Short value) {
            addCriterion("`days` <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("`days` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Short> values) {
            addCriterion("`days` in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Short> values) {
            addCriterion("`days` not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Short value1, Short value2) {
            addCriterion("`days` between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Short value1, Short value2) {
            addCriterion("`days` not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(LocalDateTime value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("start_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(LocalDateTime value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("start_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(LocalDateTime value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("start_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("start_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(LocalDateTime value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("start_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("start_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<LocalDateTime> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<LocalDateTime> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(LocalDateTime value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(LocalDateTime value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(LocalDateTime value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(LocalDateTime value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<LocalDateTime> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<LocalDateTime> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(LocalDateTime value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(LocalDateTime value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(LocalDateTime value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("add_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<LocalDateTime> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<LocalDateTime> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(LitemallCoupon.Column column) {
            addCriterion(new StringBuilder("deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }
    }
}
