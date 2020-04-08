package com.jxjz.answer.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperSubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperSubjectExample() {
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

        public Criteria andMoldIsNull() {
            addCriterion("mold is null");
            return (Criteria) this;
        }

        public Criteria andMoldIsNotNull() {
            addCriterion("mold is not null");
            return (Criteria) this;
        }

        public Criteria andMoldEqualTo(String value) {
            addCriterion("mold =", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldNotEqualTo(String value) {
            addCriterion("mold <>", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldGreaterThan(String value) {
            addCriterion("mold >", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldGreaterThanOrEqualTo(String value) {
            addCriterion("mold >=", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldLessThan(String value) {
            addCriterion("mold <", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldLessThanOrEqualTo(String value) {
            addCriterion("mold <=", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldLike(String value) {
            addCriterion("mold like", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldNotLike(String value) {
            addCriterion("mold not like", value, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldIn(List<String> values) {
            addCriterion("mold in", values, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldNotIn(List<String> values) {
            addCriterion("mold not in", values, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldBetween(String value1, String value2) {
            addCriterion("mold between", value1, value2, "mold");
            return (Criteria) this;
        }

        public Criteria andMoldNotBetween(String value1, String value2) {
            addCriterion("mold not between", value1, value2, "mold");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andAOptionIsNull() {
            addCriterion("a_option is null");
            return (Criteria) this;
        }

        public Criteria andAOptionIsNotNull() {
            addCriterion("a_option is not null");
            return (Criteria) this;
        }

        public Criteria andAOptionEqualTo(String value) {
            addCriterion("a_option =", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionNotEqualTo(String value) {
            addCriterion("a_option <>", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionGreaterThan(String value) {
            addCriterion("a_option >", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionGreaterThanOrEqualTo(String value) {
            addCriterion("a_option >=", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionLessThan(String value) {
            addCriterion("a_option <", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionLessThanOrEqualTo(String value) {
            addCriterion("a_option <=", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionLike(String value) {
            addCriterion("a_option like", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionNotLike(String value) {
            addCriterion("a_option not like", value, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionIn(List<String> values) {
            addCriterion("a_option in", values, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionNotIn(List<String> values) {
            addCriterion("a_option not in", values, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionBetween(String value1, String value2) {
            addCriterion("a_option between", value1, value2, "aOption");
            return (Criteria) this;
        }

        public Criteria andAOptionNotBetween(String value1, String value2) {
            addCriterion("a_option not between", value1, value2, "aOption");
            return (Criteria) this;
        }

        public Criteria andBOptionIsNull() {
            addCriterion("b_option is null");
            return (Criteria) this;
        }

        public Criteria andBOptionIsNotNull() {
            addCriterion("b_option is not null");
            return (Criteria) this;
        }

        public Criteria andBOptionEqualTo(String value) {
            addCriterion("b_option =", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionNotEqualTo(String value) {
            addCriterion("b_option <>", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionGreaterThan(String value) {
            addCriterion("b_option >", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionGreaterThanOrEqualTo(String value) {
            addCriterion("b_option >=", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionLessThan(String value) {
            addCriterion("b_option <", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionLessThanOrEqualTo(String value) {
            addCriterion("b_option <=", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionLike(String value) {
            addCriterion("b_option like", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionNotLike(String value) {
            addCriterion("b_option not like", value, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionIn(List<String> values) {
            addCriterion("b_option in", values, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionNotIn(List<String> values) {
            addCriterion("b_option not in", values, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionBetween(String value1, String value2) {
            addCriterion("b_option between", value1, value2, "bOption");
            return (Criteria) this;
        }

        public Criteria andBOptionNotBetween(String value1, String value2) {
            addCriterion("b_option not between", value1, value2, "bOption");
            return (Criteria) this;
        }

        public Criteria andCOptionIsNull() {
            addCriterion("c_option is null");
            return (Criteria) this;
        }

        public Criteria andCOptionIsNotNull() {
            addCriterion("c_option is not null");
            return (Criteria) this;
        }

        public Criteria andCOptionEqualTo(String value) {
            addCriterion("c_option =", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionNotEqualTo(String value) {
            addCriterion("c_option <>", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionGreaterThan(String value) {
            addCriterion("c_option >", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionGreaterThanOrEqualTo(String value) {
            addCriterion("c_option >=", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionLessThan(String value) {
            addCriterion("c_option <", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionLessThanOrEqualTo(String value) {
            addCriterion("c_option <=", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionLike(String value) {
            addCriterion("c_option like", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionNotLike(String value) {
            addCriterion("c_option not like", value, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionIn(List<String> values) {
            addCriterion("c_option in", values, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionNotIn(List<String> values) {
            addCriterion("c_option not in", values, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionBetween(String value1, String value2) {
            addCriterion("c_option between", value1, value2, "cOption");
            return (Criteria) this;
        }

        public Criteria andCOptionNotBetween(String value1, String value2) {
            addCriterion("c_option not between", value1, value2, "cOption");
            return (Criteria) this;
        }

        public Criteria andDOptionIsNull() {
            addCriterion("d_option is null");
            return (Criteria) this;
        }

        public Criteria andDOptionIsNotNull() {
            addCriterion("d_option is not null");
            return (Criteria) this;
        }

        public Criteria andDOptionEqualTo(String value) {
            addCriterion("d_option =", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionNotEqualTo(String value) {
            addCriterion("d_option <>", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionGreaterThan(String value) {
            addCriterion("d_option >", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionGreaterThanOrEqualTo(String value) {
            addCriterion("d_option >=", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionLessThan(String value) {
            addCriterion("d_option <", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionLessThanOrEqualTo(String value) {
            addCriterion("d_option <=", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionLike(String value) {
            addCriterion("d_option like", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionNotLike(String value) {
            addCriterion("d_option not like", value, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionIn(List<String> values) {
            addCriterion("d_option in", values, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionNotIn(List<String> values) {
            addCriterion("d_option not in", values, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionBetween(String value1, String value2) {
            addCriterion("d_option between", value1, value2, "dOption");
            return (Criteria) this;
        }

        public Criteria andDOptionNotBetween(String value1, String value2) {
            addCriterion("d_option not between", value1, value2, "dOption");
            return (Criteria) this;
        }

        public Criteria andEOptionIsNull() {
            addCriterion("e_option is null");
            return (Criteria) this;
        }

        public Criteria andEOptionIsNotNull() {
            addCriterion("e_option is not null");
            return (Criteria) this;
        }

        public Criteria andEOptionEqualTo(String value) {
            addCriterion("e_option =", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionNotEqualTo(String value) {
            addCriterion("e_option <>", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionGreaterThan(String value) {
            addCriterion("e_option >", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionGreaterThanOrEqualTo(String value) {
            addCriterion("e_option >=", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionLessThan(String value) {
            addCriterion("e_option <", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionLessThanOrEqualTo(String value) {
            addCriterion("e_option <=", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionLike(String value) {
            addCriterion("e_option like", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionNotLike(String value) {
            addCriterion("e_option not like", value, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionIn(List<String> values) {
            addCriterion("e_option in", values, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionNotIn(List<String> values) {
            addCriterion("e_option not in", values, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionBetween(String value1, String value2) {
            addCriterion("e_option between", value1, value2, "eOption");
            return (Criteria) this;
        }

        public Criteria andEOptionNotBetween(String value1, String value2) {
            addCriterion("e_option not between", value1, value2, "eOption");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("analysis is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("analysis is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("analysis =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("analysis <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("analysis >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("analysis >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("analysis <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("analysis <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("analysis like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("analysis not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("analysis in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("analysis not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("analysis between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("analysis not between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridIsNull() {
            addCriterion("uploadAdminUserid is null");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridIsNotNull() {
            addCriterion("uploadAdminUserid is not null");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridEqualTo(Integer value) {
            addCriterion("uploadAdminUserid =", value, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridNotEqualTo(Integer value) {
            addCriterion("uploadAdminUserid <>", value, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridGreaterThan(Integer value) {
            addCriterion("uploadAdminUserid >", value, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadAdminUserid >=", value, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridLessThan(Integer value) {
            addCriterion("uploadAdminUserid <", value, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridLessThanOrEqualTo(Integer value) {
            addCriterion("uploadAdminUserid <=", value, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridIn(List<Integer> values) {
            addCriterion("uploadAdminUserid in", values, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridNotIn(List<Integer> values) {
            addCriterion("uploadAdminUserid not in", values, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridBetween(Integer value1, Integer value2) {
            addCriterion("uploadAdminUserid between", value1, value2, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andUploadadminuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadAdminUserid not between", value1, value2, "uploadadminuserid");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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