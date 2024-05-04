package com.mangkyu.object.chapter2.ex1;

public class SequenceCondition implements DiscountCondition {

    private final int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
