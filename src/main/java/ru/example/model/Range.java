package ru.example.model;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name = "range")
    public class Range implements Serializable {

        private static final long serialVersionUID = -8095039359436728475L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Long bt;
        private String mn;
        private String mx;
        private String dt;

        public Range() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getBt() {
            return bt;
        }

        public void setBt(Long bt) {
            this.bt = bt;
        }

        public String getMn() {
            return mn;
        }

        public void setMn(String mn) {
            this.mn = mn;
        }

        public String getMx() {
            return mx;
        }

        public void setMx(String mx) {
            this.mx = mx;
        }

        public String getDt() {
            return dt;
        }

        public void setDt(String dt) {
            this.dt = dt;
        }
    }
