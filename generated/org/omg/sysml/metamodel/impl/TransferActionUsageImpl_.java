package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Property;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransferActionUsageImpl.class)
public abstract class TransferActionUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<TransferActionUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Behavior> activity;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Usage> nestedUsage;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<TransferActionUsageImpl, Membership> membership;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Type> type;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> output;
	public static volatile CollectionAttribute<TransferActionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<TransferActionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> feature;
	public static volatile CollectionAttribute<TransferActionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile ListAttribute<TransferActionUsageImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Property> property;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<TransferActionUsageImpl, Element> member;
	public static volatile ListAttribute<TransferActionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<TransferActionUsageImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Behavior> behavior;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<TransferActionUsageImpl, Membership> importedMembership;
	public static volatile SingularAttribute<TransferActionUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<TransferActionUsageImpl, ActionUsage> nestedAction;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Property> nestedProperty;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<TransferActionUsageImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Type> referencedType;
	public static volatile ListAttribute<TransferActionUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isEnd;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Feature> input;
	public static volatile SingularAttribute<TransferActionUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<TransferActionUsageImpl, Type> ownedType;
	public static volatile CollectionAttribute<TransferActionUsageImpl, FeatureTyping> typing;
	public static volatile SingularAttribute<TransferActionUsageImpl, String> name;
	public static volatile ListAttribute<TransferActionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<TransferActionUsageImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String ACTIVITY = "activity";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String FEATURE = "feature";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PROPERTY = "property";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String NESTED_STATE = "nestedState";
	public static final String BEHAVIOR = "behavior";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String NESTED_PROPERTY = "nestedProperty";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_END = "isEnd";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String TYPING = "typing";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

