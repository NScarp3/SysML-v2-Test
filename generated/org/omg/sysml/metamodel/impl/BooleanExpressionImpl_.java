package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BooleanExpressionImpl.class)
public abstract class BooleanExpressionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<BooleanExpressionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<BooleanExpressionImpl, Membership> membership;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Type> type;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> output;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> feature;
	public static volatile ListAttribute<BooleanExpressionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<BooleanExpressionImpl, Element> member;
	public static volatile ListAttribute<BooleanExpressionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Behavior> behavior;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<BooleanExpressionImpl, Membership> importedMembership;
	public static volatile SingularAttribute<BooleanExpressionImpl, UUID> identifier;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<BooleanExpressionImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Type> referencedType;
	public static volatile ListAttribute<BooleanExpressionImpl, Import> ownedImport;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isEnd;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Feature> input;
	public static volatile SingularAttribute<BooleanExpressionImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<BooleanExpressionImpl, Type> ownedType;
	public static volatile CollectionAttribute<BooleanExpressionImpl, FeatureTyping> typing;
	public static volatile SingularAttribute<BooleanExpressionImpl, String> name;
	public static volatile ListAttribute<BooleanExpressionImpl, Element> ownedMember;
	public static volatile ListAttribute<BooleanExpressionImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
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

