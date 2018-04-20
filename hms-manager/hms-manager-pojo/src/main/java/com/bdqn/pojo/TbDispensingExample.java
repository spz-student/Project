package com.bdqn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDispensingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDispensingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
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

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
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

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(Integer value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(Integer value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(Integer value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(Integer value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(Integer value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<Integer> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<Integer> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(Integer value1, Integer value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeIsNull() {
            addCriterion("medicineNmae is null");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeIsNotNull() {
            addCriterion("medicineNmae is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeEqualTo(String value) {
            addCriterion("medicineNmae =", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeNotEqualTo(String value) {
            addCriterion("medicineNmae <>", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeGreaterThan(String value) {
            addCriterion("medicineNmae >", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeGreaterThanOrEqualTo(String value) {
            addCriterion("medicineNmae >=", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeLessThan(String value) {
            addCriterion("medicineNmae <", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeLessThanOrEqualTo(String value) {
            addCriterion("medicineNmae <=", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeLike(String value) {
            addCriterion("medicineNmae like", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeNotLike(String value) {
            addCriterion("medicineNmae not like", value, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeIn(List<String> values) {
            addCriterion("medicineNmae in", values, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeNotIn(List<String> values) {
            addCriterion("medicineNmae not in", values, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeBetween(String value1, String value2) {
            addCriterion("medicineNmae between", value1, value2, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenmaeNotBetween(String value1, String value2) {
            addCriterion("medicineNmae not between", value1, value2, "medicinenmae");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberIsNull() {
            addCriterion("medicineNumber is null");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberIsNotNull() {
            addCriterion("medicineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberEqualTo(Integer value) {
            addCriterion("medicineNumber =", value, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberNotEqualTo(Integer value) {
            addCriterion("medicineNumber <>", value, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberGreaterThan(Integer value) {
            addCriterion("medicineNumber >", value, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicineNumber >=", value, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberLessThan(Integer value) {
            addCriterion("medicineNumber <", value, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberLessThanOrEqualTo(Integer value) {
            addCriterion("medicineNumber <=", value, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberIn(List<Integer> values) {
            addCriterion("medicineNumber in", values, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberNotIn(List<Integer> values) {
            addCriterion("medicineNumber not in", values, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberBetween(Integer value1, Integer value2) {
            addCriterion("medicineNumber between", value1, value2, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicinenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("medicineNumber not between", value1, value2, "medicinenumber");
            return (Criteria) this;
        }

        public Criteria andMedicineyfIsNull() {
            addCriterion("medicineYF is null");
            return (Criteria) this;
        }

        public Criteria andMedicineyfIsNotNull() {
            addCriterion("medicineYF is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineyfEqualTo(Integer value) {
            addCriterion("medicineYF =", value, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfNotEqualTo(Integer value) {
            addCriterion("medicineYF <>", value, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfGreaterThan(Integer value) {
            addCriterion("medicineYF >", value, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicineYF >=", value, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfLessThan(Integer value) {
            addCriterion("medicineYF <", value, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfLessThanOrEqualTo(Integer value) {
            addCriterion("medicineYF <=", value, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfIn(List<Integer> values) {
            addCriterion("medicineYF in", values, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfNotIn(List<Integer> values) {
            addCriterion("medicineYF not in", values, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfBetween(Integer value1, Integer value2) {
            addCriterion("medicineYF between", value1, value2, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andMedicineyfNotBetween(Integer value1, Integer value2) {
            addCriterion("medicineYF not between", value1, value2, "medicineyf");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
    }
}