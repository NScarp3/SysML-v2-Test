package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Property;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AssociationBlockImpl.class)
public abstract class AssociationBlockImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<AssociationBlockImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<AssociationBlockImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<AssociationBlockImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<AssociationBlockImpl, StateUsage> ownedState;
	public static volatile CollectionAttribute<AssociationBlockImpl, Element> source;
	public static volatile CollectionAttribute<AssociationBlockImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<AssociationBlockImpl, Superclassing> ownedSuperclassing;
	public static volatile ListAttribute<AssociationBlockImpl, Membership> membership;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> output;
	public static volatile CollectionAttribute<AssociationBlockImpl, Type> relatedType;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> feature;
	public static volatile ListAttribute<AssociationBlockImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<AssociationBlockImpl, Property> property;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<AssociationBlockImpl, Element> member;
	public static volatile ListAttribute<AssociationBlockImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<AssociationBlockImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<AssociationBlockImpl, Property> ownedProperty;
	public static volatile SingularAttribute<AssociationBlockImpl, UUID> identifier;
	public static volatile ListAttribute<AssociationBlockImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<AssociationBlockImpl, Element> ownedElement;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<AssociationBlockImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<AssociationBlockImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> endFeature;
	public static volatile ListAttribute<AssociationBlockImpl, Import> ownedImport;
	public static volatile SingularAttribute<AssociationBlockImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> associationEnd;
	public static volatile CollectionAttribute<AssociationBlockImpl, Element> target;
	public static volatile CollectionAttribute<AssociationBlockImpl, Property> flowProperty;
	public static volatile CollectionAttribute<AssociationBlockImpl, Feature> input;
	public static volatile CollectionAttribute<AssociationBlockImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<AssociationBlockImpl, Element> relatedElement;
	public static volatile SingularAttribute<AssociationBlockImpl, String> name;
	public static volatile CollectionAttribute<AssociationBlockImpl, Usage> ownedUsage;
	public static volatile ListAttribute<AssociationBlockImpl, Element> ownedMember;
	public static volatile ListAttribute<AssociationBlockImpl, Membership> ownedMembership;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_STATE = "ownedState";
	public static final String SOURCE = "source";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String MEMBERSHIP = "membership";
	public static final String OUTPUT = "output";
	public static final String RELATED_TYPE = "relatedType";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PROPERTY = "property";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_PROPERTY = "ownedProperty";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String ASSOCIATION_END = "associationEnd";
	public static final String TARGET = "target";
	public static final String FLOW_PROPERTY = "flowProperty";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

